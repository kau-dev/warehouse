package ua.kaudeveloper.warehouse.models.good;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodRepository extends PagingAndSortingRepository<Good, Long> {


    @Query(
            value = "SELECT * FROM `good`",
            nativeQuery = true)
    Page<Good> findAll( Pageable pageable);


    @Query(
            value = "SELECT * FROM `good` WHERE `this_group`= :group",
            nativeQuery = true)
    Page<Good> getAllItems(@Param("group") boolean group, Pageable pageable);

    @Query(
            value = "SELECT * FROM `good` WHERE `parent_id`= :parentId",
            nativeQuery = true)
    Page<Good> getAllChildItems(@Param("parentId") long parentId, Pageable pageable);

    @Query(
            value = "SELECT * FROM `good` WHERE `parent_id`= `id` AND `id`<>1 ",
            nativeQuery = true)
    Page<Good> getRootChilds( Pageable pageable);


    @Query(
            value = "SELECT * FROM `good` WHERE `name` like CONCAT('%',:name,'%')",
            nativeQuery = true)
    Page<Good> getAllItems(@Param("name") String name, Pageable pageable);

    @Query(
            value = "SELECT * FROM `good` WHERE `name` like CONCAT('%',:name,'%') AND `this_group`= :group",
            nativeQuery = true)
    Page<Good> getAllItems(@Param("group") boolean group, @Param("name") String name, Pageable pageable);

    @Query(
            value = "SELECT * FROM `good` WHERE `barcode`=:barcode AND `this_group`= false",
            nativeQuery = true)
    Page<Good> getAllItemsByBarCode(@Param("barcode") String barcode, Pageable pageable);

    @Query(
            value = "SELECT * FROM `good` WHERE `code`=:code AND `this_group`= false",
            nativeQuery = true)
    Page<Good> getAllItemsByCode(@Param("code") String code, Pageable pageable);

    @Query(
            value = "SELECT * FROM `good` WHERE `external_code`=:external_code AND `this_group`= false",
            nativeQuery = true)
    Page<Good> getAllItemsByExtCode(@Param("external_code") String external_code, Pageable pageable);
}
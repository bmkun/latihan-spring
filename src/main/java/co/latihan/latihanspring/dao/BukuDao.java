package co.latihan.latihanspring.dao;

import co.latihan.latihanspring.entity.Buku;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author galang
 */
public interface BukuDao extends PagingAndSortingRepository<Buku, String> {

}

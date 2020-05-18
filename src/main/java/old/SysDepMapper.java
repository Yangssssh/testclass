package old;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SysDepMapper {
    long countByExample(SysDepExample example);

    int deleteByExample(SysDepExample example);

    int deleteByPrimaryKey(String did);

    int insert(SysDep record);

    int insertSelective(SysDep record);

    List<SysDep> selectByExampleWithBLOBs(SysDepExample example);

    List<SysDep> selectByExample(SysDepExample example);

    SysDep selectByPrimaryKey(String did);

    int updateByExampleSelective(@Param("record") SysDep record, @Param("example") SysDepExample example);

    int updateByExampleWithBLOBs(@Param("record") SysDep record, @Param("example") SysDepExample example);

    int updateByExample(@Param("record") SysDep record, @Param("example") SysDepExample example);

    int updateByPrimaryKeySelective(SysDep record);

    int updateByPrimaryKeyWithBLOBs(SysDep record);

    int updateByPrimaryKey(SysDep record);
    
    List<Map<String, Object>> findDep(Map<String, Object> param);

   	void deleteBatch(String ids);
}
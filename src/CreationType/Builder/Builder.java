package CreationType.Builder;

import java.util.Collection;
import java.util.Map;

/**
 * @Author zzguo
 * @Description 生成器接口，定义创建一个输出文件对象所需的各个部件的操作，部件构造和产品装配
 * @Date 4:41 下午 2021/12/27
 **/
public interface Builder {

    /**
     * @Description 构建输出文件的Header部分
     * @Param ehm 文件头内容
     **/
    public void buildHeader(ExportHeaderModel ehm);

    /**
     * @Description 构建输出文件的Body部分
     * @Param mapData 要输出的数据的内容
     **/
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    /**
     * @Description 构建输出文件的Footer部分
     * @Param efm 文件尾的内容
     **/
    public void buildFooter(ExportFooterModel efm);
}



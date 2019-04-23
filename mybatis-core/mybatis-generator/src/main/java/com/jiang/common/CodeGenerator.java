package com.jiang.common;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * @author ShiJiang
 *
 * @desc 代码生成器
 *
 * @date 2019/4/22 9:38 PM
 */
public class CodeGenerator {

    // java根目录
    private static final String ROOT_JAVA = "/src/main/java";

    /**
     *
     * 读取控制台内容
     *
     * @param tip
     * @return
     */
    public static String scanner(String tip){
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        System.out.println("请输入:" + tip + ":");
        if (scanner.hasNext()){
            String ipt = scanner.next();
            if(StringUtils.isNotEmpty(ipt)){
                return ipt;
            }
        }

        throw new MybatisPlusException("请输入正确的" + tip + "!");
    }


    public static void main(String [] args){
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir") + "/mybatis-generator";
        gc.setOutputDir(projectPath + ROOT_JAVA) // 生成文件输出目录
        .setFileOverride(true) // 是否覆盖已有文件
        .setAuthor("LuoSJ") // 开发人员
        .setOpen(false) // 是否打开输出目录
        .setEntityName("%s") // 实体名命名方式
        .setMapperName("%sDao") // mapper命名方式
        .setServiceName("%sService")
        .setServiceImplName("%sServiceImpl")
        .setControllerName("%sController")
        .setActiveRecord(true) // 是否支持AR模式
        .setIdType(IdType.AUTO) // 主键策略
        .setBaseResultMap(true) // 生成基本的resultMap
        .setBaseColumnList(true) // 生成基本的SQL片段
        ;
        mpg.setGlobalConfig(gc);


        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/write_data?useUnicode=true&useSSL=false&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(scanner("模块名"));
        pc.setParent("com.jiang");
        pc.setEntity("pojo");
        pc.setController("controller");
        pc.setService("service");
        pc.setMapper("mapper");
        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };


        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
        // String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        //List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
//        focList.add(new FileOutConfig(templatePath) {
//            // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
//                         + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
//            }
//        });


        //cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);


        // 配置模板
        //TemplateConfig templateConfig = new TemplateConfig();
        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("com/jiang/pojo/entity2.java");
        // templateConfig.setService("c");
        //templateConfig.setController("");
        //templateConfig.setXml(null);
        //mpg.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setCapitalMode(true) //全局大写命名
        .setNaming(NamingStrategy.underline_to_camel)
        .setColumnNaming(NamingStrategy.underline_to_camel)
        .setEntityLombokModel(true)
        .setRestControllerStyle(true)
        .setInclude(scanner("表名，多个英文逗号分割").split(","))
        .setSuperEntityColumns("id")
        .setControllerMappingHyphenStyle(true)
        .setTablePrefix(pc.getModuleName() + "_");
        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

}

/**
 * @author ShiJiang
 * <p>
 * from mybatis-core
 */

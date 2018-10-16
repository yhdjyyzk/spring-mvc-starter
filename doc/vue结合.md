* 安装vue-cli, 运行vue create helloworld 创建工程  
* 创建vue.config.js，配置devServer代理为：
  ```js
  module.exports = {
    "outputDir": "static",
    "assetsDir": "static",
    "devServer": {
      "proxy": {
        "/api": {
          "target": "http://localhost:9000" // Spring MVC后端路由
        }
      }
    }
  }
  ```
* build vue代码之后，将static下面的文件拷贝至webapp的下即可。  
* redirect 解决方案
```java
    @RequestMapping("/toAbout")
    public String toAbout() {
        return "redirect_vue:/about"; // vue前台路由，在axios中添加拦截器，拦截该串，解析/about路由
    }
```
vue前台路由，在axios中添加response拦截器，拦截该串，解析/about路由，由vue-router控制前台路由。
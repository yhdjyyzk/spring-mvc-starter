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
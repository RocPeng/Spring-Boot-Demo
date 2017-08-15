##  springboot_0  
SpringBoot整合spring data jpa  
访问地址:http://localhost:8898/  
templates/welcome.html:http://localhost:8898/user  
templates/user/index.html:http://localhost:8898/user/index  
接口:http://localhost:8898/user/show?username=Roc_Peng  
请求方式:Get/Post  
请求参数:  
``` 
{
	"username":"Roc_Peng"
}
```   
返回结果:
```  
{
    "id": 1,
    "username": "Roc_Peng",
    "birthday": 1502121600000,
    "sex": "2",
    "address": null
}
```  

## springboot_1
SpringBoot整合mybatis,mybatis分别采用注解和配置文件两种方式  
访问地址:http://localhost:8899/  
主页:http://localhost:8899/user/  
接口1:http://localhost:8899/user/query/{id}  
接口2:http://localhost:8899/user/select/{id}  
example:访问http://localhost:8899/user/select/1  
返回:  
```
{
id: 1,
username: "Roc_Peng",
birthday: 1502121600000,
sex: "2",
address: null
}
```
## springboot_2 
SpringBoot整合mybatis,并使用分页插件 PageHelper和通用 Mapper,[原作者blog地址](http://blog.csdn.net/isea533/article/details/41457529),[github地址](https://github.com/abel533/MyBatis-Spring-Boot)  
访问地址:http://localhost:8900/  
接口1:http://localhost:8900/user  
返回数据格式:json  
返回内容:user的list集合  
接口2:http://localhost:8900/user/query/{id}  
返回数据格式:json  
返回内容:id对应的user

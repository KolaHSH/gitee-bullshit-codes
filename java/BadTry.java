// 背景：和B系统对接，对方需要调用我们A系统获取验证
//B系统代码大致如下
try{
//此处省略500行其他逻辑代码
//这里有一行调用A系统代码
}catch(Exception e){
    return "A系统异常，请联系A系统管理员处理";
}

//没错，我就是A系统管理员，因此我发现了B系统里那省略的500行代码的3个异常~ 好伟大的我
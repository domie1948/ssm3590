const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm5z25i/",
            name: "ssm5z25i",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm5z25i/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生学情预警系统"
        } 
    }
}
export default base

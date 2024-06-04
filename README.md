~~~bash
git remote add origin https://github.com/FirstBloodForJava/quartzStudy.git

# 修改当前本地分支名称为master
git branch -M master

# 将本地仓库的内容推送到远程仓库
git push -u origin master

# 当前git下配置代理
git config --local http.proxy http://127.0.0.1:33210

git config --local https.proxy https://127.0.0.1:33210



~~~
# HibernateCore
HibernateCore

1. To run the H2 database:
  mvn exec:java@start

2. h2 console at:
    localhost:8082
    use url as: jdbc:h2:file:~/db/mydb


3. To run the console app:
   mvn exec:java@app

4. To Open in gitpod IDE:
   https://www.gitpod.io#https://github.com/sudeepcv/HibernateCore.git

5. Track all remote git branches as local branches:

for i in \`git branch -a | grep remote | grep -v HEAD | grep -v master\`; do git branch --track ${i#remotes/origin/} $i; done
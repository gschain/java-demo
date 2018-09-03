# java-demo jwt
curl -H "Content-Type: application/json" -X POST -d '{"username":"admin","password":"password"}' http://localhost:8080/signup
curl -i -H "Content-Type: application/json" -X POST -d '{"username":"admin","password":"password"}' http://localhost:8080/login
curl -H "Content-Type: application/json" -H "Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbi1bUk9MRV9BRE1JTiwgQVVUSF9XUklURV0iLCJleHAiOjE1Mzc0MzM3NzZ9.jQd7qOeTdecyMWDbyXg3zzj9EIcX7g2-SfdWlR0G6vMLMz_b-n1cY6uwk_7HwPqhNS_595b_tdMiWyKs99qOCw" http://localhost:8080/hello

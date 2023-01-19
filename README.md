# k8s_basic_tutorial
Explicando o Básico de K8s

1 - Criação do Projeto.

Usando o assistente da IDE, criar um projeto com:
1.     Spring 2.5.6
2.     Java 11
3.     Maven
4.     spring-data-jpa
5.     spring-starter-web
6.     spring-boot-devtools
7.     lombok
8.     mysql

2 - Já com o Docker instalado, iniciar uma instância de Docker com imagem do MySql:

`sudo docker run --name my_sql_docker  -e MYSQL_DATABASE=iwnfy -e MYSQL_ROOT_PASSWORD=123 -e MYSQL_ROOT_HOST='%'  -d mysql/mysql-server:latest`

2.1 - verificar o endereço IP da intância MySql:

`docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' my_sql_docker`

3 - Configurar spring.properties.

4 - Criar classes para mapeamento com o BD

5 DOCKER
*     Criar Arquivo Dockerfile;
*     criar imagem: docker image build -t api_k8_tutorial .  (. é o dir atual)
*     verificar se imagem existe:  docker image ls
*     rodar a imagem: docker container run --rm -e DB_URL='172.19.0.2' -p 8081:8081 api_k8_tutorial
*     enviar para o docker hub:
      1 - renomear a arquivo docker image tag api_k8_tutorial:latest fbeli/api_k8_tutorial:2.0
      2 - fazer o push docker push fbeli/api_k8_tutorial:2.0


6 Criar o kubernets

*     Iniciar o minikube: 
        minikube start --driver docker
        criar atalho $ alias kubectl="minikube kubectl --"


*     Criar Arquivos:  
        config.yaml 
        secret.yaml 
        mysql.yaml 
        app.yaml

*     ver IP externo: 
        `minikube ip`  ou 
        `kubectl get node -o wide`

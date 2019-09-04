jdk 12
key/value
    key:
        config/consul-client,dev/data
    value:
        config: 
            title: title
            
jenkins + docker(无私有仓库)
    shell
        BUILD_ID=DONTKILLME
        cp -f /webapp/springcloud-demo/consul-1.0-SNAPSHOT.jar /webapp/springcloud-demo/consul-1.0-SNAPSHOT~"`date "+%Y-%m-%d|%H:%M:%S"`".jar
        cp -f /root/.jenkins/workspace/consul-config-demo/consul-config/target/consul-1.0-SNAPSHOT.jar /webapp/springcloud-demo/consul-1.0-SNAPSHOT.jar 
        cp -f /webapp/springcloud-demo/logs/consul.log /webapp/springcloud-demo/logs/consul~"`date "+%Y-%m-%d|%H:%M:%S"`".log
        if [ ! -z `docker ps | grep "consulclient1" | awk '{print $1}'` ]; then
            docker exec -i `docker ps | grep "consulclient1" | awk '{print $1}'` /bin/bash <<EOF
            fuser -k -n tcp 9000;source /etc/profile;nohup java -jar /webapp/springcloud-demo/consul-1.0-SNAPSHOT.jar > /webapp/springcloud-demo/logs/consul.log 2>&1 &
            exit
        EOF
        fi

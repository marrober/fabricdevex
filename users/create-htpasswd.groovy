

htpasswdCmdUser1 = "htpasswd -c -B -b htpasswd user001 openshift";

htpasswdCmdUser1.execute();

for (i in 2..200) {
    username = sprintf('user%03d', i);

    println(username);
    
    htpasswdCmdUser2 = "htpasswd -B -b htpasswd $username openshift";

    sleep(100);

    htpasswdCmdUser2.execute();
}


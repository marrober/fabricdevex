clusterAddress = args[0];

for (i in 27..200) {

    loginCmd = sprintf("oc login %s --username user%03d --password openshift", clusterAddress, i);

    println(loginCmd);
    
    createProjectCmd = sprintf("oc new-project user%03d", i);

    println(createProjectCmd);

    logoutCmd = sprintf("oc logout");

    println(logoutCmd);
}


def plugins = jenkins.model.Jenkins.instance.getPluginManager().getPlugins().stream().sorted()
plugins.each {println "${it.getShortName()} | ${it.getVersion()} | ${it.getDisplayName()}"}

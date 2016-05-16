class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/console"(controller: "console")
        "/"(view:"/index")
        "500"(view:'/error')
	}
}

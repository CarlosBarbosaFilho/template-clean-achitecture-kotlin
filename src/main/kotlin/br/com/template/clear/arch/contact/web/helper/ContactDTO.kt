package br.com.template.clear.arch.contact.web.helper

import br.com.template.clear.arch.contact.service.use_case_port.data.ContactInputPort

data class ContactDTO (
        val name: String,
        val email: String,
        val phone:String
)

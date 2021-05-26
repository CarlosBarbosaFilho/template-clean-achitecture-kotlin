package br.com.template.clear.arch.contact.service.use_case_port.data

data class ContactInputPort(
    val id: Long,
    val name: String,
    val email: String,
    val phone: String,

)

fun ContactInputPort.toContactOutputPort() : ContactOutputPort{
    return ContactOutputPort(
        id = id,
        name = name,
        email = email,
        phone = phone,

    )
}



package br.com.template.clear.arch.contact.presenters.domain

import br.com.template.clear.arch.contact.service.use_case_port.data.ContactInputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactOutputPort
import javax.persistence.*

@Entity
@Table(name = "tb_contacts")
data class ContactEntity (

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val name:String= "" ,
        val email:String = "",
        val phone: String = ""
)

fun ContactInputPort.toContactEntity() : ContactEntity{
        return ContactEntity(
                id = 0,
                name = this.name,
                email = this.email,
                phone = this.phone,
        )
}

fun ContactEntity.toContactOutputPort() : ContactOutputPort {
        return ContactOutputPort(
        id = id,
        name = name,
        email = email,
        phone = phone,

        )
}


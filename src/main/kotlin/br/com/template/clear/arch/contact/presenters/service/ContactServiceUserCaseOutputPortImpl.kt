package br.com.template.clear.arch.contact.presenters.service

import br.com.template.clear.arch.contact.presenters.db.ContactEntityRepository
import br.com.template.clear.arch.contact.presenters.domain.toContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactInputPort
import br.com.template.clear.arch.contact.service.use_case_port.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.output.ContactServiceUseCaseOutputPort
import org.springframework.stereotype.Service

@Service
class ContactServiceUserCaseOutputPortImpl (
    private val contactEntityRepository: ContactEntityRepository): ContactServiceUseCaseOutputPort
{

    override fun create(contactInputPort: ContactInputPort): ContactOutputPort {
        TODO("Not yet implemented")
    }

    override fun getById(id: Long): ContactOutputPort {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<ContactOutputPort> {
        return this.contactEntityRepository.findAll()
            .map { it.toContactOutputPort() }
    }

    override fun remove(id: Long) {
        TODO("Not yet implemented")
    }


}
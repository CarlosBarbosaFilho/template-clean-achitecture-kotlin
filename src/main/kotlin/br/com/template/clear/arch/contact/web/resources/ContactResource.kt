package br.com.template.clear.arch.contact.web.resources

import br.com.template.clear.arch.contact.service.use_case_port.data.ContactOutputPort
import br.com.template.clear.arch.contact.service.use_case_port.input.ContactServiceUseCaseInputPort
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class ContactResource(private  val contactServiceUseCaseInputPort: ContactServiceUseCaseInputPort){

    @GetMapping("/all-contacts")
    fun getContacts(): ResponseEntity<List<ContactOutputPort>>{
        return ResponseEntity.ok(this.contactServiceUseCaseInputPort.getAll())
    }
}
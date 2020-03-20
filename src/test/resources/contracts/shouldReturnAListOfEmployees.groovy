import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return a List of Employees"
    request {
        url "/employees"
        method GET()
    }
    response {
        status 201
        body(["Pascal", "Thomas"])
    }

}
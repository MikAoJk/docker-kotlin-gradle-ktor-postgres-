package io.github.mikaojk.services

import io.github.mikaojk.db.DatabaseInterface
import io.github.mikaojk.db.validData
import kotlinx.coroutines.runBlocking

class ValidateService {
    fun executeValidateData(
        validationData: ValidationData,
        database: DatabaseInterface
    ): ValidationResult = runBlocking {
        if (database.validData(validationData.data)) {
            return@runBlocking ValidationResult("OK")
        }
        return@runBlocking ValidationResult("INVALID")
    }
}

data class ValidationData(val data: String)

data class ValidationResult(val result: String)

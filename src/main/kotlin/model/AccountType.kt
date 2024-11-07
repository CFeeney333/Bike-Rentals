package model

/**
 * Different account types have different privileges in the system
 */
enum class AccountType(type: String) {
    MANAGER("Manager Account"), STAFF("Staff Account")
}
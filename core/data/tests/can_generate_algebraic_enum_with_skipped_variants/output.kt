package com.agilebits.onepassword

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

@Serializable
sealed class SomeEnum {
	@Serializable
	@SerialName("A")
	object A: SomeEnum()
	@Serializable
	@SerialName("C")
	data class C(val content: Int): SomeEnum()
}


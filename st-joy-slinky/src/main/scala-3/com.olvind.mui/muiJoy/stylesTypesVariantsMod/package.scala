package com.olvind.mui.muiJoy.stylesTypesVariantsMod

import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DefaultVariantKey = (Exclude[DefaultVariantProp, "solid"]) | (/* template literal string: ${Exclude<DefaultVariantProp,solid>}${State} */ String)

type DefaultVariantProp = "plain" | "outlined" | "soft" | "solid"

type State = "Hover" | "Active" | "Disabled"

type VariantKey = DefaultVariantProp | (/* template literal string: ${DefaultVariantProp}${State} */ String)

type VariantProp = OverridableStringUnion[DefaultVariantProp, VariantPropOverrides]

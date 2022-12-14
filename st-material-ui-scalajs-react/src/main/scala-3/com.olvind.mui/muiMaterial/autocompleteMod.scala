package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.CreateFilterOptionsConfig
import com.olvind.mui.muiBase.useAutocompleteUseAutocompleteMod.FilterOptionsState
import com.olvind.mui.muiMaterial.autocompleteAutocompleteClassesMod.AutocompleteClasses
import com.olvind.mui.muiMaterial.autocompleteAutocompleteMod.AutocompleteProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteMod {
  
  @JSImport("@mui/material/Autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.annotation.targetName("default_div")
  inline def default[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo, "div"]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/Autocomplete", "autocompleteClasses")
  @js.native
  val autocompleteClasses: AutocompleteClasses = js.native
  
  inline def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")().asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  inline def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  
  inline def getAutocompleteUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutocompleteUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}

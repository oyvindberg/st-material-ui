package com.olvind.mui.muiJoy

import com.olvind.mui.muiBase.autocompleteUnstyledUseAutocompleteMod.CreateFilterOptionsConfig
import com.olvind.mui.muiBase.autocompleteUnstyledUseAutocompleteMod.FilterOptionsState
import com.olvind.mui.muiJoy.autocompleteAutocompleteClassesMod.AutocompleteClasses
import com.olvind.mui.muiJoy.autocompleteAutocompleteMod.AutocompleteComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteMod {
  
  @JSImport("@mui/joy/Autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Autocomplete", JSImport.Default)
  @js.native
  val default: AutocompleteComponent = js.native
  
  @JSImport("@mui/joy/Autocomplete", "autocompleteClasses")
  @js.native
  val autocompleteClasses: AutocompleteClasses = js.native
  
  inline def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")().asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  inline def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  
  inline def getAutocompleteUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutocompleteUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}

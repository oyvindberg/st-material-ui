package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAutocompleteListbox
import com.olvind.mui.muiJoy.autocompleteListboxAutocompleteListboxClassesMod.AutocompleteListboxClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteListboxMod {
  
  @JSImport("@mui/joy/AutocompleteListbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/AutocompleteListbox", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAutocompleteListbox, Element | Null] = js.native
  
  @JSImport("@mui/joy/AutocompleteListbox", "autocompleteListboxClasses")
  @js.native
  val autocompleteListboxClasses: AutocompleteListboxClasses = js.native
  
  inline def getAutocompleteListboxUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutocompleteListboxUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}

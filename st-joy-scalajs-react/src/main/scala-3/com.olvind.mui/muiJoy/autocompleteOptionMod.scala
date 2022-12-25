package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAutocompleteOptionT
import com.olvind.mui.muiJoy.autocompleteOptionAutocompleteOptionClassesMod.AutocompleteOptionClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteOptionMod {
  
  @JSImport("@mui/joy/AutocompleteOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/AutocompleteOption", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAutocompleteOptionT, Element | Null] = js.native
  
  @JSImport("@mui/joy/AutocompleteOption", "autocompleteOptionClasses")
  @js.native
  val autocompleteOptionClasses: AutocompleteOptionClasses = js.native
  
  inline def getAutocompleteOptionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutocompleteOptionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}

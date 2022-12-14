package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAutocompleteOptionT
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemeDetailedHTMLPro
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteOptionAutocompleteOptionMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Autocomplete](https://mui.com/joy-ui/react-autocomplete/)
    *
    * API:
    *
    * - [AutocompleteOption API](https://mui.com/joy-ui/api/autocomplete-option/)
    */
  @JSImport("@mui/joy/AutocompleteOption/AutocompleteOption", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAutocompleteOptionT, Element | Null] = js.native
  
  @JSImport("@mui/joy/AutocompleteOption/AutocompleteOption", "StyledAutocompleteOption")
  @js.native
  val StyledAutocompleteOption: js.Function1[
    /* props */ MUIStyledCommonPropsThemeDetailedHTMLPro, 
    japgolly.scalajs.react.facade.React.Element | Null
  ] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsAutocompleteOptionT, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `autocompleteOptionAutocompleteOptionMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsAutocompleteOptionT, Element | Null] = default
}

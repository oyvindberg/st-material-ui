package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAutocompleteListbox
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemeClassAttributes
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteListboxAutocompleteListboxMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Autocomplete](https://mui.com/joy-ui/react-autocomplete/)
    *
    * API:
    *
    * - [AutocompleteListbox API](https://mui.com/joy-ui/api/autocomplete-listbox/)
    */
  @JSImport("@mui/joy/AutocompleteListbox/AutocompleteListbox", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAutocompleteListbox, Element | Null] = js.native
  
  @JSImport("@mui/joy/AutocompleteListbox/AutocompleteListbox", "StyledAutocompleteListbox")
  @js.native
  val StyledAutocompleteListbox: js.Function1[/* props */ MUIStyledCommonPropsThemeClassAttributes, ReactElement | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsAutocompleteListbox, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `autocompleteListboxAutocompleteListboxMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsAutocompleteListbox, Element | Null] = default
}

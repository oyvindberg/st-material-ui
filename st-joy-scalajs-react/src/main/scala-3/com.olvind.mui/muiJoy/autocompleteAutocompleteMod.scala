package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.autocompleteAutocompletePropsMod.AutocompleteProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteAutocompleteMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Autocomplete](https://mui.com/joy-ui/react-autocomplete/)
    *
    * API:
    *
    * - [Autocomplete API](https://mui.com/joy-ui/api/autocomplete/)
    */
  @JSImport("@mui/joy/Autocomplete/Autocomplete", JSImport.Default)
  @js.native
  val default: AutocompleteComponent = js.native
  
  @js.native
  trait AutocompleteComponent extends StObject {
    
    def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo]): Element = js.native
    
    var propTypes: js.UndefOr[Any] = js.native
  }
  
  type _To = AutocompleteComponent
  
  /* This means you don't have to write `default`, but can instead just say `autocompleteAutocompleteMod.foo` */
  override def _to: AutocompleteComponent = default
}

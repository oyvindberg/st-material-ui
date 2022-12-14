package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsModalOverflowTypeMa
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemePickDetailedHTMAriaactivedescendant
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalOverflowModalOverflowMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Modal](https://mui.com/joy-ui/react-modal/)
    *
    * API:
    *
    * - [ModalOverflow API](https://mui.com/joy-ui/api/modal-overflow/)
    */
  @JSImport("@mui/joy/ModalOverflow/ModalOverflow", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsModalOverflowTypeMa, Element | Null] = js.native
  
  @JSImport("@mui/joy/ModalOverflow/ModalOverflow", "ModalOverflowRoot")
  @js.native
  val ModalOverflowRoot: js.Function1[
    /* props */ MUIStyledCommonPropsThemePickDetailedHTMAriaactivedescendant, 
    japgolly.scalajs.react.facade.React.Element | Null
  ] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsModalOverflowTypeMa, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `modalOverflowModalOverflowMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsModalOverflowTypeMa, Element | Null] = default
}

package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsModalCloseTypeMapbu
import com.olvind.mui.muiJoy.anon.PickMUIStyledCommonPropsThemeClassAttribAbout
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalCloseModalCloseMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Modal](https://mui.com/joy-ui/react-modal/)
    *
    * API:
    *
    * - [ModalClose API](https://mui.com/joy-ui/api/modal-close/)
    */
  @JSImport("@mui/joy/ModalClose/ModalClose", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsModalCloseTypeMapbu, Element | Null] = js.native
  
  @JSImport("@mui/joy/ModalClose/ModalClose", "ModalCloseRoot")
  @js.native
  val ModalCloseRoot: js.Function1[/* props */ PickMUIStyledCommonPropsThemeClassAttribAbout, ReactElement | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsModalCloseTypeMapbu, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `modalCloseModalCloseMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsModalCloseTypeMapbu, Element | Null] = default
}

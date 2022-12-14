package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsListTypeMapul
import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemeDetailedHTMLProAriaatomic
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/joy-ui/react-list/)
    *
    * API:
    *
    * - [List API](https://mui.com/joy-ui/api/list/)
    */
  @JSImport("@mui/joy/List/List", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListTypeMapul, Element | Null] = js.native
  
  @JSImport("@mui/joy/List/List", "StyledList")
  @js.native
  val StyledList: js.Function1[
    /* props */ MUIStyledCommonPropsThemeDetailedHTMLProAriaatomic, 
    ReactElement | Null
  ] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsListTypeMapul, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `listListMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsListTypeMapul, Element | Null] = default
}

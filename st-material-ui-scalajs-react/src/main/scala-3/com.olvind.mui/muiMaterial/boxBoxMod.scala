package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBoxTypeMapdivTheme
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.boxBoxMod.BoxTypeMap
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxBoxMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Box](https://mui.com/material-ui/react-box/)
    *
    * API:
    *
    * - [Box API](https://mui.com/material-ui/api/box/)
    */
  @JSImport("@mui/material/Box/Box", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdivTheme, Element | Null] = js.native
  
  type BoxProps[D /* <: ElementType */, P] = OverrideProps[BoxTypeMap[P, D, Theme], D]
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdivTheme, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `boxBoxMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdivTheme, Element | Null] = default
}

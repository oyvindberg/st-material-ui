package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiStyledEngine.globalStylesGlobalStylesMod.GlobalStylesProps
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalStylesMod {
  
  @JSImport("@mui/joy/GlobalStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: GlobalStylesProps[Theme]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}

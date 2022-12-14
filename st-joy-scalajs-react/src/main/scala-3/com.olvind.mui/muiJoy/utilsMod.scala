package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsSvgIconTypeMapsvg
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@mui/joy/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSvgIcon(path: Node, displayName: String): js.Function1[/* props */ DefaultComponentPropsSvgIconTypeMapsvg, Element | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSvgIcon")(path.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ DefaultComponentPropsSvgIconTypeMapsvg, Element | Null]]
}

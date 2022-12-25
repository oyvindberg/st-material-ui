package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsSvgIconTypeMapsvg
import com.olvind.mui.muiJoy.svgIconSvgIconClassesMod.SvgIconClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconMod {
  
  @JSImport("@mui/joy/SvgIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/SvgIcon", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSvgIconTypeMapsvg, Element | Null] = js.native
  
  inline def getSvgIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSvgIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/SvgIcon", "svgIconClasses")
  @js.native
  val svgIconClasses: SvgIconClasses = js.native
}

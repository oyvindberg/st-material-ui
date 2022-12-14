package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAspectRatioTypeMapd
import com.olvind.mui.muiJoy.aspectRatioAspectRatioClassesMod.AspectRatioClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioMod {
  
  @JSImport("@mui/joy/AspectRatio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Aspect Ratio](https://mui.com/joy-ui/react-aspect-ratio/)
    *
    * API:
    *
    * - [AspectRatio API](https://mui.com/joy-ui/api/aspect-ratio/)
    */
  @JSImport("@mui/joy/AspectRatio", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAspectRatioTypeMapd, Element | Null] = js.native
  
  @JSImport("@mui/joy/AspectRatio", "aspectRatioClasses")
  @js.native
  val aspectRatioClasses: AspectRatioClasses = js.native
  
  inline def getAspectRatioUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAspectRatioUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}

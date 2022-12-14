package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsCircularProgressTyp
import com.olvind.mui.muiJoy.circularProgressCircularProgressClassesMod.CircularProgressClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressMod {
  
  @JSImport("@mui/joy/CircularProgress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * ## ARIA
    *
    * If the progress bar is describing the loading progress of a particular region of a page,
    * you should use `aria-describedby` to point to the progress bar, and set the `aria-busy`
    * attribute to `true` on that region until it has finished loading.
    *
    * Demos:
    *
    * - [Circular Progress](https://mui.com/joy-ui/react-circular-progress/)
    *
    * API:
    *
    * - [CircularProgress API](https://mui.com/joy-ui/api/circular-progress/)
    */
  @JSImport("@mui/joy/CircularProgress", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCircularProgressTyp, Element | Null] = js.native
  
  @JSImport("@mui/joy/CircularProgress", "circularProgressClasses")
  @js.native
  val circularProgressClasses: CircularProgressClasses = js.native
  
  inline def getCircularProgressUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCircularProgressUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}

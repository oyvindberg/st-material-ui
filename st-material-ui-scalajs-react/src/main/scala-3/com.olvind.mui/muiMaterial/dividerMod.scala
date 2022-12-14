package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDividerTypeMaphr
import com.olvind.mui.muiMaterial.dividerDividerClassesMod.DividerClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod {
  
  @JSImport("@mui/material/Divider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Divider](https://mui.com/material-ui/react-divider/)
    * - [Lists](https://mui.com/material-ui/react-list/)
    *
    * API:
    *
    * - [Divider API](https://mui.com/material-ui/api/divider/)
    */
  @JSImport("@mui/material/Divider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element] = js.native
  
  @JSImport("@mui/material/Divider", "dividerClasses")
  @js.native
  val dividerClasses: DividerClasses = js.native
  
  inline def getDividerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDividerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}

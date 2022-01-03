package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDividerTypeMaphr
import com.olvind.mui.muiMaterial.dividerClassesMod.DividerClasses
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
    * - [Dividers](https://mui.com/components/dividers/)
    * - [Lists](https://mui.com/components/lists/)
    *
    * API:
    *
    * - [Divider API](https://mui.com/api/divider/)
    */
  @JSImport("@mui/material/Divider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element] = js.native
  
  @JSImport("@mui/material/Divider", "dividerClasses")
  @js.native
  val dividerClasses: DividerClasses = js.native
  
  inline def getDividerUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDividerUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}

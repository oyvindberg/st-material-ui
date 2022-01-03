package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSvgIconTypeMapsvg
import com.olvind.mui.muiMaterial.svgIconClassesMod.SvgIconClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconMod {
  
  @JSImport("@mui/material/SvgIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/components/icons/)
    * - [Material Icons](https://mui.com/components/material-icons/)
    *
    * API:
    *
    * - [SvgIcon API](https://mui.com/api/svg-icon/)
    */
  /* Inlined (props : DefaultComponentProps<SvgIconTypeMap<{}, 'svg'>> & {}): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    @scala.inline
    def apply(props: DefaultComponentPropsSvgIconTypeMapsvg): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/SvgIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/SvgIcon", "default.muiName")
    @js.native
    def muiName: String = js.native
    @scala.inline
    def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getSvgIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSvgIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/SvgIcon", "svgIconClasses")
  @js.native
  val svgIconClasses: SvgIconClasses = js.native
}

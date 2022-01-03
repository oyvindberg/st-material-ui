package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsIconTypeMapspan
import com.olvind.mui.muiMaterial.iconClassesMod.IconClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("@mui/material/Icon", JSImport.Namespace)
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
    * - [Icon API](https://mui.com/api/icon/)
    */
  /* Inlined (props : DefaultComponentProps<IconTypeMap<{}, 'span'>> & {}): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    inline def apply(props: DefaultComponentPropsIconTypeMapspan): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/Icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/Icon", "default.muiName")
    @js.native
    def muiName: String = js.native
    inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  inline def getIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Icon", "iconClasses")
  @js.native
  val iconClasses: IconClasses = js.native
}

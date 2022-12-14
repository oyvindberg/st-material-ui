package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.BaseClassName
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsIconTypeMapspan
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconIconMod {
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/material-ui/icons/)
    * - [Material Icons](https://mui.com/material-ui/material-icons/)
    *
    * API:
    *
    * - [Icon API](https://mui.com/material-ui/api/icon/)
    */
  /* Inlined (props : DefaultComponentProps<IconTypeMap<{}, 'span'>> & {}): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    inline def apply(props: DefaultComponentPropsIconTypeMapspan): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/Icon/Icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/Icon/Icon", "default.muiName")
    @js.native
    def muiName: String = js.native
    inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  type IconProps[D /* <: ElementType */, P] = OverrideProps[IconTypeMap[P, D], D]
  
  trait IconPropsColorOverrides extends StObject
  
  trait IconPropsSizeOverrides extends StObject
  
  trait IconTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & BaseClassName
  }
  object IconTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & BaseClassName): IconTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconTypeMap[P, D]]
    }
    
    extension [Self <: IconTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (IconTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & BaseClassName): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}

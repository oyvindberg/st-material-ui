package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.BadgeUnstyledTypeMapspanprops
import com.olvind.mui.muiBase.muiBaseStrings.bottom
import com.olvind.mui.muiBase.muiBaseStrings.left
import com.olvind.mui.muiBase.muiBaseStrings.right
import com.olvind.mui.muiBase.muiBaseStrings.top
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeUnstyledPropsMod {
  
  trait BadgeOrigin extends StObject {
    
    var horizontal: left | right
    
    var vertical: top | bottom
  }
  object BadgeOrigin {
    
    inline def apply(horizontal: left | right, vertical: top | bottom): BadgeOrigin = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeOrigin]
    }
    
    extension [Self <: BadgeOrigin](x: Self) {
      
      inline def setHorizontal(value: left | right): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: top | bottom): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  trait BadgeUnstyledComponentsPropsOverrides extends StObject
  
  trait ExtendBadgeUnstyledTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & BadgeUnstyledTypeMapspanprops
  }
  object ExtendBadgeUnstyledTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & BadgeUnstyledTypeMapspanprops
    ): ExtendBadgeUnstyledTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendBadgeUnstyledTypeMap[M]]
    }
    
    extension [Self <: ExtendBadgeUnstyledTypeMap[?], M /* <: OverridableTypeMap */](x: Self & ExtendBadgeUnstyledTypeMap[M]) {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & BadgeUnstyledTypeMapspanprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}

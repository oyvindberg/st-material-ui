package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.BadgeUnstyledTypeMapspanprops
import com.olvind.mui.muiBase.muiBaseStrings.bottom
import com.olvind.mui.muiBase.muiBaseStrings.left
import com.olvind.mui.muiBase.muiBaseStrings.right
import com.olvind.mui.muiBase.muiBaseStrings.top
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeUnstyledPropsMod {
  
  @js.native
  trait BadgeOrigin extends StObject {
    
    var horizontal: left | right = js.native
    
    var vertical: top | bottom = js.native
  }
  object BadgeOrigin {
    
    @scala.inline
    def apply(horizontal: left | right, vertical: top | bottom): BadgeOrigin = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeOrigin]
    }
    
    @scala.inline
    implicit class BadgeOriginMutableBuilder[Self <: BadgeOrigin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: left | right): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: top | bottom): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BadgeUnstyledComponentsPropsOverrides extends StObject
  
  @js.native
  trait ExtendBadgeUnstyledTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any = js.native
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with BadgeUnstyledTypeMapspanprops = js.native
  }
  object ExtendBadgeUnstyledTypeMap {
    
    @scala.inline
    def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with BadgeUnstyledTypeMapspanprops
    ): ExtendBadgeUnstyledTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendBadgeUnstyledTypeMap[M]]
    }
    
    @scala.inline
    implicit class ExtendBadgeUnstyledTypeMapMutableBuilder[Self <: ExtendBadgeUnstyledTypeMap[_], M /* <: OverridableTypeMap */] (val x: Self with ExtendBadgeUnstyledTypeMap[M]) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with BadgeUnstyledTypeMapspanprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}

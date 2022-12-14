package com.olvind.mui.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspenseProps extends StObject {
  
  var children: js.UndefOr[slinky.core.facade.ReactElement] = js.undefined
  
  /** A fallback react tree to show when a Suspense child (like React.lazy) suspends */
  var fallback: js.UndefOr[slinky.core.facade.ReactElement] = js.undefined
  
  /**
    * The presence of this prop indicates that the content is computationally expensive to render.
    * In other words, the tree is CPU bound and not I/O bound (e.g. due to fetching data).
    * @see {@link https://github.com/facebook/react/pull/19936}
    */
  var unstable_expectedLoadTime: js.UndefOr[Double] = js.undefined
}
object SuspenseProps {
  
  inline def apply(): SuspenseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspenseProps]
  }
  
  extension [Self <: SuspenseProps](x: Self) {
    
    inline def setChildren(value: slinky.core.facade.ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setFallback(value: slinky.core.facade.ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setUnstable_expectedLoadTime(value: Double): Self = StObject.set(x, "unstable_expectedLoadTime", value.asInstanceOf[js.Any])
    
    inline def setUnstable_expectedLoadTimeUndefined: Self = StObject.set(x, "unstable_expectedLoadTime", js.undefined)
  }
}

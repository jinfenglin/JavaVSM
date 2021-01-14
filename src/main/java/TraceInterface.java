import java.util.Collection;
import java.util.List;

public interface TraceInterface {
    double getRelevance(Collection<String> source, Collection<String> target);
}
